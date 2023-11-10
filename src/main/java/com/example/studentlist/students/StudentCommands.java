    package com.example.studentlist.students;

    import com.example.studentlist.students.Student;
    import com.example.studentlist.students.StudentService;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.shell.standard.ShellComponent;
    import org.springframework.shell.standard.ShellMethod;

    import java.util.List;
    import java.util.UUID;

    @ShellComponent
    @Slf4j
    public class StudentCommands {

        private final StudentService studentService;
        @Autowired
        public StudentCommands(StudentService studentService){
            this.studentService = studentService;
        }

        @ShellMethod(key = "show")
        public List<Student> showAllStudents(){
            return studentService.getAllStudents();
        }

        @ShellMethod(key = "add")
        public String addStudent(String firstName, String lastName, int age){
            Student student = studentService.addStudent(firstName, lastName, age);
            return "Student was added " + student.getId();
        }

        @ShellMethod(key = "delete")
        public String deleteStudent(UUID id){
            studentService.deleteStudent(id);
            return "Student with id " + id + "was deleted";
        }

        @ShellMethod(key = "c")
        public String clearStudentsCommand(){
            studentService.clearStudents();
            return "All students were deleted";
        }

    }
