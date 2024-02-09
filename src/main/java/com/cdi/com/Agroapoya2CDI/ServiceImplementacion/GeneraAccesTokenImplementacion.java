package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.BasicApplication;
import com.cdi.com.Agroapoya2CDI.Services.GeneraAccesTokenService;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.ServiceAccountCredentials;

@Service
public class GeneraAccesTokenImplementacion implements GeneraAccesTokenService{

    private static String ACCESS_TOKEN = "";

    @Override
    public String Token() {
        BasicApplication classprincipal = new BasicApplication();
        try {
            InputStream inputStream = loadFile();
            ACCESS_TOKEN = fetchAccessToken(inputStream);
            classprincipal.setTOKEN(ACCESS_TOKEN);
            System.out.println(ACCESS_TOKEN);
        } catch (IOException e) {
            classprincipal.setTOKEN(null);
        }
        return ACCESS_TOKEN;
    }

    public InputStream loadFile() throws IOException {
        Resource resource = new ClassPathResource("service_account_key.json");
        return resource.getInputStream();
    }

    public String fetchAccessToken(InputStream inputStream) throws IOException {
        List<String> scopes = Arrays.asList("https://www.googleapis.com/auth/drive");
        GoogleCredentials credentials = ServiceAccountCredentials.fromStream(inputStream).createScoped(scopes);
        AccessToken accessToken = credentials.refreshAccessToken();
        return accessToken.getTokenValue();
    }
    
}