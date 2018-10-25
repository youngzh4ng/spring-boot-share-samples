package com.springboot.share.jpa;

import com.springboot.share.domain.InternalUserProfile;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InternalUserProfileRepository extends MongoRepository<InternalUserProfile, ObjectId> {

    InternalUserProfile findOneByUserIdIgnoreCase(String userId);

}
