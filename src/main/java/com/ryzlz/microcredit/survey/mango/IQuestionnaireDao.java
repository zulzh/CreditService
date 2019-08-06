package com.ryzlz.microcredit.survey.mango;


import com.ryzlz.microcredit.survey.dto.Questionnaire;
import com.ryzlz.microcredit.survey.dto.QuestionnaireTemplate;


public interface IQuestionnaireDao {

    //提交问卷模板
    void insertQuestionnaireTemplate(QuestionnaireTemplate questionnaireTemplateId);

    //根据问卷ID 取得问卷
    QuestionnaireTemplate getQuestionnaireTemplate(String QuestionnaireTemplateId);

    //提交问卷
    void insertQuestionnaire(Questionnaire questionnaire);

    //修改问卷
    void updataQuestionnaire(Questionnaire questionnaire);

    //查询问卷
    Questionnaire getQuestionnaireById(String questionnaireId);



}
