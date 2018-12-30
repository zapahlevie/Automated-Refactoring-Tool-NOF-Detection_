package com.finalproject.automated.refactoring.tool.nof.detection.service;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import lombok.NonNull;

public interface NOFDetection {
    Long nofDetection(@NonNull ClassModel classModel);
}
