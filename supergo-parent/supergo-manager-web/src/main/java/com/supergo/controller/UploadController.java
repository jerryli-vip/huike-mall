package com.supergo.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.supergo.utils.FastDFSClient;
import com.supergo.utils.ResultVO;

@RestController
public class UploadController {

	@Value("${baseImgUrl}")
	private String baseImgUrl;
	
	@RequestMapping("uploadFile")
	public ResultVO uploadFile(MultipartFile uploadFile,String imgGroup){
		
		try {
			//将图片存储到远程的FastDFS（Fast 分布式文件系统）服务器上
			if ( uploadFile == null ) {
				return ResultVO.build(500, "上传文件为空");
			}
			//上传文件的原始名称
			String originalFilename = uploadFile.getOriginalFilename();
			if (StringUtils.isBlank(originalFilename)) {
				return ResultVO.build(500, "上传文件名称为空");
			}
			//获取扩展名,不带.
			String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
			//返回的imgUrl ： group1/M00/00/00/wKgE5lr7V--AJARBAAI8oMh_kzA271.jpg
			String imgUrl = FastDFSClient.uploadFile(uploadFile.getBytes(), extName );
			
			return ResultVO.ok(baseImgUrl + imgUrl);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultVO.build(500, "上传失败");
		}
		
	}
}
