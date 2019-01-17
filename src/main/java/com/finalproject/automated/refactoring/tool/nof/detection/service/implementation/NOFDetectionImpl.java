package com.finalproject.automated.refactoring.tool.nof.detection.service.implementation;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import com.finalproject.automated.refactoring.tool.nof.detection.service.NOFDetection;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class NOFDetectionImpl implements NOFDetection {

    @Override
    public Long nofDetection(@NonNull    ClassModel classModel) {
        Long nof = 0L;
        if(classModel.getAttributes() == null){
            return 0L;
        }
        else{
            for(String s : classModel.getAttributes()){
                nof = nof + s.split(",").length;
            }
        }
        return nof;
    }
}
