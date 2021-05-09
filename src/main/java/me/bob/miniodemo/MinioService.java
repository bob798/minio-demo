package me.bob.miniodemo;

import io.minio.*;
import io.minio.errors.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Service
public class MinioService {

    private static MinioClient minioClient;

    static {
        minioClient = MinioClient.builder().endpoint("https://play.min.io")
                .credentials("Q3AM3UQ867SPQQA43P2F", "zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG").build();
    }

    public void upload(UploadObjectArgs objectArgs) {
        try {
            minioClient.uploadObject(objectArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void putObject(PutObjectArgs objectArgs) {
        try {
            minioClient.putObject(objectArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(DeleteObjectTagsArgs objectTagsArgs) {
        try {
            minioClient.deleteObjectTags(objectTagsArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void download(DownloadObjectArgs objectArgs) {
        try {
            minioClient.downloadObject(objectArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
