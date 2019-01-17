package com.finalproject.automated.refactoring.tool.nof.detection.service.implementation;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import com.finalproject.automated.refactoring.tool.model.PropertyModel;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class NOFDetectionImplTest {
    private ClassModel classModel;
    private ClassModel classModelNoAttributes;
    private NOFDetectionImpl nofDetection;

    @Before
    public void setUp(){
        nofDetection = new NOFDetectionImpl();
        classModel = createClassModel();
        classModelNoAttributes = createClassModelNoAttributes();
    }

    @Test
    public void nofDetection_success() {
        Long count = nofDetection.nofDetection(classModel);
        assertEquals(0, count.intValue());
    }

    @Test
    public void nofDetection_success_emptyMethodModel() {
        Long count = nofDetection.nofDetection(classModelNoAttributes);
        assertEquals(0, count.intValue());
    }

    @Test(expected = NullPointerException.class)
    public void nofDetection_success_nullBody() {
        nofDetection.nofDetection(null);
    }

    private ClassModel createClassModel() {
        return ClassModel.builder()
                .packageName("com.finalproject.automated.refactoring.tool")
                .imports(Arrays.asList("import java.util.ArrayList", "import java.util.Arrays;"))
                .contentOuter("")
                .keywords(Collections.singletonList("public"))
                .name("TestClassImpl")
                .extend("")
                .implement("TestClass")
                .attributes(null)
                .methodModels(null)
                .contentInner("")
                .loc(0L)
                .nom(0L)
                .nof(0L)
                .build();
    }

    private ClassModel createClassModelNoAttributes() {
        return ClassModel.builder()
                .packageName("com.finalproject.automated.refactoring.tool")
                .imports(Arrays.asList("import java.util.ArrayList", "import java.util.Arrays;"))
                .contentOuter("")
                .keywords(Collections.singletonList("public"))
                .name("TestClassImpl")
                .extend("")
                .implement("TestClass")
                .attributes(null)
                .methodModels(null)
                .contentInner("")
                .loc(0L)
                .nom(0L)
                .nof(0L)
                .build();
    }
}
