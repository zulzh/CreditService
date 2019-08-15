package com.ryzlz.microcredit.survey.mango;


import com.ryzlz.microcredit.survey.dto.Questionnaire;
import com.ryzlz.microcredit.survey.dto.QuestionnaireTemplate;


public interface IQuestionnaireDao {

    //提交问卷模板
    int insertQuestionnaireTemplate(QuestionnaireTemplate questionnaireTemplateId);

    //根据问卷ID 取得问卷
    QuestionnaireTemplate getQuestionnaireTemplate(String QuestionnaireTemplateId);

    //提交问卷
    int insertQuestionnaire(Questionnaire questionnaire);

    //修改问卷
    int updataQuestionnaire(Questionnaire questionnaire);

    //查询问卷
    Questionnaire getQuestionnaireById(String questionnaireId);



}
