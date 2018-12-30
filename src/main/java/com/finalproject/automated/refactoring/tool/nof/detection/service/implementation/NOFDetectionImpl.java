package com.finalproject.automated.refactoring.tool.nof.detection.service.implementation;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import com.finalproject.automated.refactoring.tool.nof.detection.service.NOFDetection;
import lombok.NonNull;

public class NOFDetectionImpl implements NOFDetection {

    @Override
    public Long nofDetection(@NonNull ClassModel classModel) {
        if(classModel.getAttributes() == null){
            return 0L;
        }
        return (Long) (long) classModel.getAttributes().size();
    }
}
