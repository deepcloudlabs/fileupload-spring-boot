package com.example.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("files")
public class FileController {

	@Value("${upload.folder}")
	private String uploadFolder;

	@GetMapping
	public String home() {
		return "home";
	}

	
	@PostMapping
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			byte[] bytes = file.getBytes();
			Path path = Paths.get(uploadFolder + "/" +file.getOriginalFilename());
			Files.write(path, bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "home";
	}
}
