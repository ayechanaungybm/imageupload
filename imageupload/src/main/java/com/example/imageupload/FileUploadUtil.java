package com.example.imageupload;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {
	public static void saveFile(String uploaddir,String fileName,MultipartFile multipartfile)throws IOException{
		Path uploadPath=Paths.get(uploaddir);
		if(!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		try {
			InputStream inputstream=multipartfile.getInputStream();
			Path filePath=uploadPath.resolve(fileName);
			Files.copy(inputstream,filePath,StandardCopyOption.REPLACE_EXISTING);
			
		}catch(IOException e) {
			
		}
	}
}
