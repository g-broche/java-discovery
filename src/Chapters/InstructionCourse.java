package Chapters;

import Courses.Instruction;

public class InstructionCourse extends BaseCourseWrapper{
    public static void runCourse(){
        InstructionCourse.runCourse("testing instructions", InstructionCourse::testInstructions);
    }

        private static void testInstructions(){
        Instruction.calculateResults();
        Instruction.testLoops();
    }
}
