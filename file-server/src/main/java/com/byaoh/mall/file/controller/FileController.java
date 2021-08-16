package com.byaoh.mall.file.controller;

import com.byaoh.mall.framework.web.Result;
import com.byaoh.mall.framework.web.ResultFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * FileController
 *
 * @author l
 * @date 2021-08-12 22:39:33
 */
@Slf4j
@RestController
public class FileController {
	@PostMapping("/file/upload/{type}")
	public Result<String> fileUpload(@RequestParam("file") MultipartFile file, @PathVariable("type") Integer type) {
		return ResultFactory.success("");
	}
}
