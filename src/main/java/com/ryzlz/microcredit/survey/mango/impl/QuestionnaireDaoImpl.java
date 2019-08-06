package com.ryzlz.microcredit.survey.mango.impl;

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
    public void insertQuestionnaireTemplate(QuestionnaireTemplate questionnaireTemplate) {
        mongoTemplate.insert(questionnaireTemplate);
    }

    @Override
    public QuestionnaireTemplate getQuestionnaireTemplate(String QuestionnaireTemplateId) {
        return null;
    }

    @Override
    public void insertQuestionnaire(Questionnaire questionnaire) {
        mongoTemplate.insert(questionnaire);
    }

    @Override
    public void updataQuestionnaire(Questionnaire questionnaire) {

    }

    @Override
    public Questionnaire getQuestionnaireById(String questionnaireId) {

        return null;
    }


}
