package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.BasicApplication;
import com.cdi.com.Agroapoya2CDI.Entity.ListArchivosDriveEntity;
import com.cdi.com.Agroapoya2CDI.Services.GeneraAccesTokenService;
import com.cdi.com.Agroapoya2CDI.Services.ListDocDriveService;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.FileList;

@Service
public class ListDocDriveServiceImplementacion implements ListDocDriveService {

    private static String ACCESS_TOKEN = "";
    private static final JacksonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    @Autowired
    GeneraAccesTokenService serviceGeneraAccesTokenService;

    @Override
    public List<ListArchivosDriveEntity> ListDoc() {
        BasicApplication classprincipal = new BasicApplication();
        ACCESS_TOKEN = classprincipal.getTOKEN();

        if (ACCESS_TOKEN == null) {
            ACCESS_TOKEN = serviceGeneraAccesTokenService.Token();
        }

        System.out.println(ACCESS_TOKEN);

        List<ListArchivosDriveEntity> fileList = new ArrayList<>();
        try {
            fileList = listFilesInFolder();
        } catch (IOException ex) {
            classprincipal.setTOKEN(null);
            Logger.getLogger(GeneraAccesTokenImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GeneralSecurityException ex) {
            classprincipal.setTOKEN(null);
            Logger.getLogger(GeneraAccesTokenImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileList;
    }

    public List<ListArchivosDriveEntity> listFilesInFolder() throws IOException, GeneralSecurityException {
        HttpRequestInitializer requestInitializer = request -> {
            request.getHeaders().setAuthorization("Bearer " + ACCESS_TOKEN);
        };

        Drive driveService = new Drive.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JSON_FACTORY,
                requestInitializer)
                .setApplicationName("DriveApiApp")
                .build();

        List<ListArchivosDriveEntity> fileList = new ArrayList<>();
        String fields = "files(name, id, webViewLink)";
        FileList result = driveService.files().list().setQ("'" + "1QVkB7Y-rOloiSc0h0VRUGq9b4SKikjNc" + "' in parents").setFields(fields).execute();
        for (com.google.api.services.drive.model.File file : result.getFiles()) {
            ListArchivosDriveEntity obj = new ListArchivosDriveEntity();
            obj.setId(file.getId());
            obj.setNombreDocumento(file.getName());
            obj.setLink(file.getWebViewLink());
            obj.setComplemento(file.getName() + "|" + file.getId() + "|" + file.getWebViewLink());

            fileList.add(obj);
        }

        return fileList;
    }
}
