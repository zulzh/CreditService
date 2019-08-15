package com.ryzlz.microcredit.survey.mango.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.result.UpdateResult;
import com.ryzlz.microcredit.survey.dto.Questionnaire;
import com.ryzlz.microcredit.survey.dto.QuestionnaireTemplate;
import com.ryzlz.microcredit.survey.mango.IQuestionnaireDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Repository
public class QuestionnaireDaoImpl implements IQuestionnaireDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public int insertQuestionnaireTemplate(QuestionnaireTemplate questionnaireTemplate) {

        //TODO 入参校验

        mongoTemplate.insert(questionnaireTemplate);
        return 0;
    }

    @Override
    public QuestionnaireTemplate getQuestionnaireTemplate(String QuestionnaireTemplateId) {

        //TODO 入参校验

        Query query = new Query();

        //入参校验
        if(StringUtils.isEmpty(QuestionnaireTemplateId)) {
            return null;
        }

        //ID条件筛选
        query.addCriteria(Criteria.where("_id").is(QuestionnaireTemplateId));


        QuestionnaireTemplate questionnaireTemplate = mongoTemplate.
                findOne(query, QuestionnaireTemplate.class);

        return questionnaireTemplate;
    }

    @Override
    public int insertQuestionnaire(Questionnaire questionnaire) {
        //TODO 入参校验
        mongoTemplate.insert(questionnaire);

        return 0;
    }

    @Override
    public int updataQuestionnaire(Questionnaire questionnaire) {
        Query query = new Query();

        //入参校验
        if(StringUtils.isEmpty(questionnaire.get_id())) {
            return 0;
        }else {
            //ID条件筛选
            query.addCriteria(Criteria.where("_id").is(questionnaire.get_id()));
        }

        Update update = new Update();
//
//        //更新处理人编码
//        update.addToSet("userCode",dealComplaintReportingReq.getUserCode());
//
//        //更新投诉举报状态
//        update.addToSet("complaintStatusCode",dealComplaintReportingReq.getComplaintStatusCode());
//
//        //更新处理人证件类型
//        update.addToSet("servIdcaedTypeCode",userIdcard.getIdcardTypeCode());
//
//        //更新处理人证件编码
//        update.addToSet("servIdcardNo",userIdcard.getIdcardNo());
//
//        //更新修改时间
//        update.addToSet("modifyTime", DateUtils.getCurrentTime(Config.DATE_TYPE));


        UpdateResult result = mongoTemplate.updateFirst(query,update,Questionnaire.class);

        return (int)result.getMatchedCount();
    }

    @Override
    public Questionnaire getQuestionnaireById(String questionnaireId) {

        //TODO 入参校验

        Query query = new Query();

        //入参校验
        if(StringUtils.isEmpty(questionnaireId)) {
            return null;
        }

        //ID条件筛选
        query.addCriteria(Criteria.where("_id").is(questionnaireId));


        Questionnaire questionnaire = mongoTemplate.
                findOne(query, Questionnaire.class);

        return questionnaire;
    }


}
