package com.example.amiya_lab_6;


@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*") // Allow cross-origin requests (useful for frontend)
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        try {
            Student savedStudent = studentRepository.save(student);
            return ResponseEntity.ok("Student saved successfully with ID: " + savedStudent.getId());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to save student: " + e.getMessage());
        }
    }
}