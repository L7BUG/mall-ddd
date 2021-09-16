package com.byaoh.mall.autoconfigure;

import com.byaoh.mall.framework.web.Result;
import com.byaoh.mall.framework.web.ResultFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * HelloController
 *
 * @author l
 * @date 2021-09-04 11:03:55
 */
@Slf4j
@RestController
@RequestMapping("/helloStarter")
public class HelloStarterController {

	@GetMapping
	public Result<String> hello() {
		log.info("#####hello#####");
		return ResultFactory.success("hello");
	}

	@PostMapping
	public Result<Void> temp(MultipartFile file) {
		return ResultFactory.success();
	}
}
