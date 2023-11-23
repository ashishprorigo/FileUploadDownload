package com.prorigo.service;

import org.springframework.web.multipart.MultipartFile;

import com.prorigo.model.Attachment;

public interface AttachmentService {
Attachment saveAttachment(MultipartFile file) throws Exception;
 
Attachment getAttachment(String fileId) throws Exception;
}