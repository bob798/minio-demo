package me.bob.miniodemo;

import io.minio.DownloadObjectArgs;
import io.minio.PutObjectArgs;
import io.minio.UploadObjectArgs;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MinioServiceTest extends TestCase {

    @Resource
    private MinioService minioService;

    @Test
    public void testUpload() throws IOException {
        minioService.upload(UploadObjectArgs.builder().filename("/Users/bob/Desktop/test.png").object("multi/test.png").bucket("000").build());
    }

    public void testPutObject() {
        minioService.putObject(PutObjectArgs.builder().bucket("testbob").build());

    }

    public void testDelete() {
    }

    @Test
    public void download() {
        minioService.download(DownloadObjectArgs.builder().bucket("000").object("multi/test.png").filename("/Users/bob/Desktop/testminio.png").build());
    }
}