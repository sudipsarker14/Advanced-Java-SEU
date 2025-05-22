import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Home = () => {
    const [students, setStudents] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/api/students')
             .then(res => setStudents(res.data))
             .catch(err => console.error(err));
    }, []);

    return (
        <div>
            <h2>Student Details</h2>
            <ul>
                {students.map(student => (
                    <li key={student.id}>{student.name} - {student.email} - {student.department}</li>
                ))}
            </ul>
        </div>
    );
};

export default Home;
