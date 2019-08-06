package com.ryzlz.microcredit.survey.controller;


import com.ryzlz.microcredit.common.ResponseData;
import com.ryzlz.microcredit.common.dto.Result;
import com.ryzlz.microcredit.survey.dto.Questionnaire;
import com.ryzlz.microcredit.survey.dto.QuestionnaireTemplate;
import com.ryzlz.microcredit.survey.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 问卷相关接口
 */

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    //根据问卷ID 取得问卷
    @PostMapping("/getQuestionnaireTemplate")
    public ResponseData getQuestionnaireTemplate(String questionnaireTemplateId){
        ResponseData responseData = new ResponseData();
        responseData.setResult(Result.Success);
        responseData.setData(questionService.getQuestionnaireTemplate(questionnaireTemplateId));
        return responseData;
    }

    //提交问卷
    @PostMapping("/insertQuestionnaire")
    public ResponseData insertQuestionnaire(Questionnaire questionnaire){
        ResponseData responseData = new ResponseData();
        responseData.setResult(Result.Success);

        questionService.insertQuestionnaire(questionnaire);

        return responseData;
    }


    //提交问卷模板
    @PostMapping("/questionnaireTemplate")
    public ResponseData insertQuestionnaireTemplate(QuestionnaireTemplate questionnaireTemplate){
        ResponseData responseData = new ResponseData();
        responseData.setResult(Result.Success);

        questionService.insertQuestionnaireTemplate(questionnaireTemplate);

        return responseData;
    }



//    //修改问卷
//    void updataQuestionnaire(Questionnaire questionnaire);
//
//    //查询问卷
//    Questionnaire getQuestionnaireById(String questionnaireId);




}
