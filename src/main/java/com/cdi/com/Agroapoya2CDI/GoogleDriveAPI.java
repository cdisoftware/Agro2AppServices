package com.cdi.com.Agroapoya2CDI;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.java6.auth.oauth2.VerificationCodeReceiver;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.Permission;
import com.google.api.services.drive.model.PermissionList;
//import com.google.api.services.drive.model.PermissionRole;
//import com.google.api.services.drive.model.PermissionType;
//import com.google.api.services.drive.model.PermissionDetails;
//import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;


/**
 *
 * @author juan7
 */
public class GoogleDriveAPI {

 private static final String APPLICATION_NAME = "AIzaSyAcsZ9JtNnRQ8jd1iJ1myq8vHP5ruuBJLE";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE_FILE);
    private static final String CREDENTIALS_FILE_PATH = "/client_secret.json";

    /**
     * Creates an authorized Credential object.
     * @param httpTransport The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If there is no client_secret.
     */
    private static Credential getCredentials(final HttpTransport httpTransport) throws IOException {
        // Load client secrets.
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
                new java.io.InputStreamReader(GoogleDriveAPI.class.getResourceAsStream(CREDENTIALS_FILE_PATH)));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                httpTransport, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();

        Credential credential = new AuthorizationCodeInstalledApp(
                flow, new LocalServerReceiver.Builder().setPort(8888).build())
                .authorize("user");

        return credential;
    }

    public static void main(String... args) throws IOException, GeneralSecurityException {
        // Build a new authorized API client service.
        final HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        Drive service = new Drive.Builder(httpTransport, JSON_FACTORY, getCredentials(httpTransport))
                .setApplicationName(APPLICATION_NAME)
                .build();

        // Get the file to upload
        java.io.File fileContent = new java.io.File("path/to/your/file");

//        // Set the metadata for the new file
//        File fileMetadata = new File();
//        fileMetadata.setName(fileContent.getName());
//
//        // Create the file content
//        FileContent mediaContent = new FileContent("application
    }
    
}
