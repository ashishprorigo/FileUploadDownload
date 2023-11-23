package com.prorigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prorigo.model.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, String> {
}
