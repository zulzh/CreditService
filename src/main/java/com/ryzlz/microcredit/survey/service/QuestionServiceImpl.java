package com.ryzlz.microcredit.survey.service;


import com.ryzlz.microcredit.survey.dto.Questionnaire;
import com.ryzlz.microcredit.survey.dto.QuestionnaireTemplate;
import com.ryzlz.microcredit.survey.mango.IQuestionnaireDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    IQuestionnaireDao iQuestionnaireDao;

    @Override
    public QuestionnaireTemplate getQuestionnaireTemplate(String QuestionnaireTemplateId) {
        QuestionnaireTemplate questionnaireTemplate = iQuestionnaireDao.getQuestionnaireTemplate(QuestionnaireTemplateId);
        return questionnaireTemplate;
    }

    @Override
    public void insertQuestionnaire(Questionnaire questionnaire) {

    }

    @Override
    public void updataQuestionnaire(Questionnaire questionnaire) {

    }

    @Override
    public Questionnaire getQuestionnaireById(String questionnaireId) {
        return null;
    }

    @Override
    public void insertQuestionnaireTemplate(QuestionnaireTemplate questionnaireTemplate) {
        iQuestionnaireDao.insertQuestionnaireTemplate(questionnaireTemplate);
    }
}
