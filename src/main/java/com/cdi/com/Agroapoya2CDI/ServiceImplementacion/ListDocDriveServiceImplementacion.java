package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.BasicApplication;
import com.cdi.com.Agroapoya2CDI.Entity.ListArchivosDriveEntity;
import com.cdi.com.Agroapoya2CDI.Services.GeneraAccesTokenService;
import com.cdi.com.Agroapoya2CDI.Services.ListDocDriveService;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
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
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.FileList;
import java.io.FileInputStream;
import java.util.Collections;
import org.springframework.core.io.ClassPathResource;

@Service
public class ListDocDriveServiceImplementacion implements ListDocDriveService {

    private static final JacksonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String APPLICATION_NAME = "DriveApiApp";

    private Drive getDriveService() throws Exception {
        GoogleCredential credential = GoogleCredential.fromStream(
                new ClassPathResource("drive-5577eec0f02f.json").getInputStream())
                .createScoped(Collections.singleton(DriveScopes.DRIVE));

        return new Drive.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JSON_FACTORY,
                credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    @Override
    public List<ListArchivosDriveEntity> ListDoc() {
        List<ListArchivosDriveEntity> fileList = new ArrayList<>();
        try {
            Drive driveService = getDriveService();

            String folderId = "1qq0Ems58rENhLk5s1qDEy1ZfkmidmgEo"; // ID de la carpeta nueva
            FileList result = driveService.files().list()
                    .setQ("'" + folderId + "' in parents")
                    .setFields("files(name, id, webViewLink)")
                    .execute();

            for (com.google.api.services.drive.model.File file : result.getFiles()) {
                ListArchivosDriveEntity obj = new ListArchivosDriveEntity();
                obj.setId(file.getId());
                obj.setNombreDocumento(file.getName());
                obj.setLink(file.getWebViewLink());
                obj.setComplemento(file.getName() + "|" + file.getId() + "|" + file.getWebViewLink());
                fileList.add(obj);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return fileList;
    }
}
