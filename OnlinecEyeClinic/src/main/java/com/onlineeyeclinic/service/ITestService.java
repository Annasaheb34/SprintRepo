package com.onlineeyeclinic.service;

import java.util.List;

import com.onlineeyeclinic.dto.TestModule;
import com.onlineeyeclinic.exceptions.DoctorIdNotFoundException;
import com.onlineeyeclinic.exceptions.TestIdNotFoundException;



public interface ITestService {
public TestModule addTest(TestModule test);
public TestModule updateTest(TestModule test);
public TestModule removeTest(int testId)throws TestIdNotFoundException;
public TestModule viewTest(int testId)throws TestIdNotFoundException;
public List<TestModule> viewAllTests();
public List<TestModule> viewTestsByDoctor(int doctorId)throws DoctorIdNotFoundException;
}
