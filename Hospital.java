class Hospital {

    public static String[] findDoctorsBySpecialization(String specialization) {
        System.out.println("Invoked findDoctorsBySpecialization...\n");

        if (specialization == "Cardiac Sciences") {
            String[] doctors = {
                "Dr. Arvind Rao", "Dr. Sneha Kulkarni", "Dr. Ramesh Iyer",
                "Dr. Priya Nair", "Dr. Karthik Reddy", "Dr. Meenakshi Sharma",
                "Dr. Vinay Shetty", "Dr. Anil Kapoor", "Dr. Kavitha Menon",
                "Dr. Deepak Joshi", "Dr. Rohit Sinha", "Dr. Lakshmi Narayan",
                "Dr. Harsha Vardhan", "Dr. Swathi Rao", "Dr. Aditya Verma"
            };
            return doctors;
        }

        else if (specialization == "Dental Science") {
            String[] doctors = {
                "Dr. Neha Agarwal", "Dr. Pooja Shah", "Dr. Rahul Mehta",
                "Dr. Simran Kaur", "Dr. Akash Jain", "Dr. Ritu Malhotra",
                "Dr. Kiran Desai", "Dr. Nikhil Patil", "Dr. Sonal Gupta",
                "Dr. Arjun Das", "Dr. Shruthi Rao", "Dr. Aman Khanna",
                "Dr. Tanya Roy", "Dr. Mohit Bansal", "Dr. Isha Verma"
            };
            return doctors;
        }

        else if (specialization == "Dermatology") {
            String[] doctors = {
                "Dr. Aishwarya Nair", "Dr. Radhika Iyer", "Dr. Manish Gupta",
                "Dr. Pallavi Sharma", "Dr. Rohan Kapoor", "Dr. Snehal Patil",
                "Dr. Varsha Rao", "Dr. Tarun Bhat", "Dr. Neelima Reddy",
                "Dr. Arvind Kumar", "Dr. Lavanya Shetty", "Dr. Preeti Sinha",
                "Dr. Anusha Menon", "Dr. Sagar Kulkarni", "Dr. Divya Jain"
            };
            return doctors;
        }

        else if (specialization == "Diabetology/Endocrinology") {
            String[] doctors = {
                "Dr. Vivek Sharma", "Dr. Ritu Bhatia", "Dr. Ashok Reddy",
                "Dr. Madhuri Nair", "Dr. Gaurav Khanna", "Dr. Neeta Joshi",
                "Dr. Rahul Chandra", "Dr. Keerthi Rao", "Dr. Sanjay Verma",
                "Dr. Harini Iyer", "Dr. Pradeep Kumar", "Dr. Shalini Das",
                "Dr. Amit Sinha", "Dr. Pavan Shetty", "Dr. Komal Gupta"
            };
            return doctors;
        }

        else if (specialization == "ENT") {
            String[] doctors = {
                "Dr. Rajesh Kumar", "Dr. Swathi Menon", "Dr. Harsh Patel",
                "Dr. Sangeeta Rao", "Dr. Nitin Shah", "Dr. Kavya Iyer",
                "Dr. Manoj Reddy", "Dr. Ananya Gupta", "Dr. Vikram Singh",
                "Dr. Bhavana Das", "Dr. Chetan Kulkarni", "Dr. Neeraj Bhat",
                "Dr. Roshni Jain", "Dr. Prakash Shetty", "Dr. Aarti Nair"
            };
            return doctors;
        }

        else if (specialization == "Emergency and Trauma") {
            String[] doctors = {
                "Dr. Rohit Kapoor", "Dr. Meera Sharma", "Dr. Ajay Verma",
                "Dr. Sneha Joshi", "Dr. Kunal Reddy", "Dr. Anitha Rao",
                "Dr. Varun Bhat", "Dr. Shreya Menon", "Dr. Pranav Gupta",
                "Dr. Ramesh Patil", "Dr. Tanvi Kulkarni", "Dr. Arvind Iyer",
                "Dr. Pooja Desai", "Dr. Nikhil Jain", "Dr. Suresh Kumar"
            };
            return doctors;
        }

        else if (specialization == "Neurology") {
            String[] doctors = {
                "Dr. Sandeep Rao", "Dr. Aishwarya Menon", "Dr. Rohini Patel",
                "Dr. Vikrant Sharma", "Dr. Lavanya Reddy", "Dr. Kiran Gupta",
                "Dr. Neha Verma", "Dr. Anoop Das", "Dr. Swaroop Shetty",
                "Dr. Gayatri Kulkarni", "Dr. Nagesh Iyer", "Dr. Divakar Jain",
                "Dr. Preeti Sharma", "Dr. Yash Bhat", "Dr. Monica Rao"
            };
            return doctors;
        }

        else if (specialization == "Neurosurgery") {
            String[] doctors = {
                "Dr. Arjun Reddy", "Dr. Deepika Sharma", "Dr. Nitin Rao",
                "Dr. Mehul Patel", "Dr. Sahana Iyer", "Dr. Akhil Gupta",
                "Dr. Kavitha Das", "Dr. Shyam Kumar", "Dr. Snehal Jain",
                "Dr. Rohit Bhat", "Dr. Aarti Verma", "Dr. Mohan Shetty",
                "Dr. Divya Kulkarni", "Dr. Suresh Iyer", "Dr. Keshav Rao"
            };
            return doctors;
        }

        else if (specialization == "Oncology") {
            String[] doctors = {
                "Dr. Raghav Sharma", "Dr. Pooja Reddy", "Dr. Meena Patel",
                "Dr. Harish Kumar", "Dr. Snehal Gupta", "Dr. Kavya Rao",
                "Dr. Adarsh Jain", "Dr. Swetha Iyer", "Dr. Pradeep Das",
                "Dr. Nikita Menon", "Dr. Akash Verma", "Dr. Ritu Sharma",
                "Dr. Sandeep Kulkarni", "Dr. Gopal Shetty", "Dr. Tanisha Bhat"
            };
            return doctors;
        }

        else if (specialization == "Paediatrics") {
            String[] doctors = {
                "Dr. Shruthi Rao", "Dr. Nikhil Verma", "Dr. Ananya Sharma",
                "Dr. Arvind Gupta", "Dr. Meera Nair", "Dr. Rahul Patil",
                "Dr. Aishwarya Jain", "Dr. Suman Reddy", "Dr. Rohit Das",
                "Dr. Kiran Menon", "Dr. Pooja Kulkarni", "Dr. Varsha Iyer",
                "Dr. Aditya Kumar", "Dr. Sneha Bhat", "Dr. Harini Rao"
            };
            return doctors;
        }

                else if (specialization == "Orthopaedics") {
            String[] doctors = {
                "Dr. Rohan Shetty","Dr. Anil Kumar","Dr. Megha Rao",
                "Dr. Suresh Patil","Dr. Kavitha Menon","Dr. Harsha Reddy",
                "Dr. Priyanka Jain","Dr. Nitin Verma","Dr. Aditya Kulkarni",
                "Dr. Varun Bhat","Dr. Swathi Iyer","Dr. Deepak Sharma",
                "Dr. Arvind Gupta","Dr. Sneha Desai","Dr. Rohit Das"
            };
            return doctors;
        }

        else if (specialization == "Urology") {
            String[] doctors = {
                "Dr. Vikram Rao","Dr. Manish Sharma","Dr. Neeraj Patel",
                "Dr. Gaurav Jain","Dr. Pavan Shetty","Dr. Rahul Iyer",
                "Dr. Sanjay Kulkarni","Dr. Aarti Menon","Dr. Ramesh Verma",
                "Dr. Kiran Reddy","Dr. Swaroop Das","Dr. Lavanya Gupta",
                "Dr. Mohan Patil","Dr. Divya Nair","Dr. Akhil Bhat"
            };
            return doctors;
        }

        else if (specialization == "Radiology") {
            String[] doctors = {
                "Dr. Chetan Rao","Dr. Bhavana Sharma","Dr. Nikhil Jain",
                "Dr. Sandeep Gupta","Dr. Tanvi Iyer","Dr. Arjun Verma",
                "Dr. Snehal Patil","Dr. Pooja Das","Dr. Raghav Reddy",
                "Dr. Keerthi Menon","Dr. Anoop Shetty","Dr. Varsha Kulkarni",
                "Dr. Karthik Bhat","Dr. Meera Joshi","Dr. Aman Kapoor"
            };
            return doctors;
        }

        else if (specialization == "Pulmonology") {
            String[] doctors = {
                "Dr. Rohini Rao","Dr. Prakash Kumar","Dr. Neha Sharma",
                "Dr. Yash Patel","Dr. Swetha Nair","Dr. Harish Jain",
                "Dr. Lavanya Reddy","Dr. Manoj Verma","Dr. Sagar Gupta",
                "Dr. Kavya Menon","Dr. Anil Shetty","Dr. Divakar Das",
                "Dr. Pooja Kulkarni","Dr. Ritu Bhat","Dr. Kunal Singh"
            };
            return doctors;
        }

        else if (specialization == "Nephrology") {
            String[] doctors = {
                "Dr. Suresh Rao","Dr. Deepika Sharma","Dr. Nitin Jain",
                "Dr. Aishwarya Gupta","Dr. Pradeep Reddy","Dr. Meena Patil",
                "Dr. Rohit Verma","Dr. Kavitha Iyer","Dr. Arjun Menon",
                "Dr. Sneha Kulkarni","Dr. Varun Das","Dr. Monica Bhat",
                "Dr. Rahul Shetty","Dr. Tanisha Rao","Dr. Gopal Sharma"
            };
            return doctors;
        }

        else if (specialization == "Gastroenterology and Hepatobiliary Sciences") {
            String[] doctors = {
                "Dr. Aditya Rao","Dr. Meera Sharma","Dr. Rakesh Jain",
                "Dr. Swathi Gupta","Dr. Nikhil Reddy","Dr. Pavan Kumar",
                "Dr. Aarti Menon","Dr. Rohit Patil","Dr. Snehal Das",
                "Dr. Vivek Shetty","Dr. Lavanya Rao","Dr. Suman Verma",
                "Dr. Pranav Iyer","Dr. Harini Kulkarni","Dr. Keshav Bhat"
            };
            return doctors;
        }

        else if (specialization == "Obstetrics and Gynaecology") {
            String[] doctors = {
                "Dr. Anitha Rao","Dr. Swetha Sharma","Dr. Meenakshi Iyer",
                "Dr. Pooja Gupta","Dr. Kavya Menon","Dr. Ritu Jain",
                "Dr. Deepa Reddy","Dr. Harsha Kulkarni","Dr. Shalini Das",
                "Dr. Sneha Verma","Dr. Aishwarya Bhat","Dr. Neeta Patil",
                "Dr. Lakshmi Rao","Dr. Divya Kapoor","Dr. Monica Sharma"
            };
            return doctors;
        }

        else if (specialization == "Organ Transplant") {
            String[] doctors = {
                "Dr. Sandeep Rao","Dr. Rohini Sharma","Dr. Vikram Reddy",
                "Dr. Prakash Jain","Dr. Aarti Kulkarni","Dr. Manoj Iyer",
                "Dr. Swaroop Gupta","Dr. Kavitha Das","Dr. Nitin Menon",
                "Dr. Raghav Shetty","Dr. Snehal Patil","Dr. Meera Verma",
                "Dr. Arvind Kumar","Dr. Tanvi Rao","Dr. Gaurav Bhat"
            };
            return doctors;
        }

        else if (specialization == "Rheumatology") {
            String[] doctors = {
                "Dr. Neha Rao","Dr. Pradeep Sharma","Dr. Aishwarya Jain",
                "Dr. Rohit Gupta","Dr. Swathi Patil","Dr. Manoj Verma",
                "Dr. Ramesh Iyer","Dr. Divya Shetty","Dr. Harish Menon",
                "Dr. Kavya Reddy","Dr. Tanvi Das","Dr. Nikhil Kulkarni",
                "Dr. Sneha Kapoor","Dr. Sagar Rao","Dr. Gopal Jain"
            };
            return doctors;
        }

        else if (specialization == "Thoracic Surgery") {
            String[] doctors = {
                "Dr. Arjun Rao","Dr. Mehul Sharma","Dr. Kiran Reddy",
                "Dr. Swetha Menon","Dr. Nitin Gupta","Dr. Harsha Das",
                "Dr. Vivek Jain","Dr. Snehal Patil","Dr. Rohini Kapoor",
                "Dr. Pavan Shetty","Dr. Aditya Verma","Dr. Monica Rao",
                "Dr. Raghav Kulkarni","Dr. Lavanya Iyer","Dr. Suresh Kumar"
            };
            return doctors;
        }

        else if (specialization == "Transfusion Medicine") {
            String[] doctors = {
                "Dr. Nikhil Rao","Dr. Meena Sharma","Dr. Arvind Jain",
                "Dr. Sneha Patil","Dr. Rohit Gupta","Dr. Kavitha Menon",
                "Dr. Deepak Reddy","Dr. Tanvi Das","Dr. Swaroop Shetty",
                "Dr. Aishwarya Verma","Dr. Pooja Iyer","Dr. Rahul Bhat",
                "Dr. Harini Kapoor","Dr. Manish Kulkarni","Dr. Varsha Rao"
            };
            return doctors;
        }

        else if (specialization == "Endocrine Surgery") {
            String[] doctors = {
                "Dr. Gaurav Rao","Dr. Snehal Sharma","Dr. Pradeep Jain",
                "Dr. Meera Gupta","Dr. Rohini Reddy","Dr. Pavan Menon",
                "Dr. Aditya Das","Dr. Kavya Kulkarni","Dr. Nitin Verma",
                "Dr. Swetha Iyer","Dr. Harsha Kapoor","Dr. Arjun Shetty",
                "Dr. Lavanya Rao","Dr. Ramesh Patil","Dr. Suman Bhat"
            };
            return doctors;
        }

        else if (specialization == "Vascular Surgery") {
            String[] doctors = {
                "Dr. Vikrant Rao","Dr. Deepika Sharma","Dr. Kunal Jain",
                "Dr. Sneha Gupta","Dr. Rohit Menon","Dr. Swaroop Patil",
                "Dr. Tanvi Reddy","Dr. Manoj Das","Dr. Harish Iyer",
                "Dr. Kavitha Kapoor","Dr. Nikhil Verma","Dr. Aarti Kulkarni",
                "Dr. Sagar Rao","Dr. Monica Sharma","Dr. Arvind Shetty"
            };
            return doctors;
        }

        else if (specialization == "Liver Transplant and Hepatobiliary Sciences") {
            String[] doctors = {
                "Dr. Adarsh Rao","Dr. Meenakshi Sharma","Dr. Pranav Jain",
                "Dr. Swetha Gupta","Dr. Rohit Kulkarni","Dr. Kavya Reddy",
                "Dr. Manoj Iyer","Dr. Snehal Patil","Dr. Vivek Das",
                "Dr. Nikhil Kapoor","Dr. Aishwarya Rao","Dr. Pooja Menon",
                "Dr. Harsha Verma","Dr. Tanisha Bhat","Dr. Suresh Jain"
            };
            return doctors;
        }

        else if (specialization == "Palliative Medicine") {
            String[] doctors = {
                "Dr. Ritu Rao","Dr. Sneha Sharma","Dr. Nitin Gupta",
                "Dr. Meera Patil","Dr. Rohini Jain","Dr. Aditya Menon",
                "Dr. Kavitha Reddy","Dr. Sagar Das","Dr. Swaroop Kapoor",
                "Dr. Aarti Iyer","Dr. Manoj Shetty","Dr. Harini Verma",
                "Dr. Deepak Kulkarni","Dr. Varsha Rao","Dr. Gopal Sharma"
            };
            return doctors;
        }

        else if (specialization == "Medical Genetics") {
            String[] doctors = {
                "Dr. Nikhil Rao","Dr. Lavanya Sharma","Dr. Rohit Jain",
                "Dr. Snehal Gupta","Dr. Meena Reddy","Dr. Adarsh Iyer",
                "Dr. Kavya Menon","Dr. Pavan Das","Dr. Aishwarya Kapoor",
                "Dr. Swetha Patil","Dr. Manoj Verma","Dr. Tanvi Rao",
                "Dr. Harish Kulkarni","Dr. Monica Shetty","Dr. Suresh Jain"
            };
            return doctors;
        }

        else if (specialization == "Pain and Palliative Medicine") {
            String[] doctors = {
                "Dr. Sneha Rao","Dr. Rohit Sharma","Dr. Nitin Jain",
                "Dr. Meera Gupta","Dr. Kavitha Menon","Dr. Aditya Patil",
                "Dr. Swaroop Reddy","Dr. Tanvi Das","Dr. Vivek Kapoor",
                "Dr. Harini Iyer","Dr. Manoj Kulkarni","Dr. Aarti Rao",
                "Dr. Gaurav Sharma","Dr. Pooja Jain","Dr. Sagar Shetty"
            };
            return doctors;
        }

        else if (specialization == "Geriatric Medicine") {
            String[] doctors = {
                "Dr. Ramesh Rao","Dr. Meenakshi Sharma","Dr. Pradeep Jain",
                "Dr. Sneha Gupta","Dr. Rohit Menon","Dr. Swetha Iyer",
                "Dr. Kavitha Patil","Dr. Aditya Kapoor","Dr. Nitin Das",
                "Dr. Aishwarya Verma","Dr. Harsha Reddy","Dr. Pooja Kulkarni",
                "Dr. Sagar Rao","Dr. Monica Jain","Dr. Deepak Shetty"
            };
            return doctors;
        }

        else if (specialization == "Critical Care") {
            String[] doctors = {
                "Dr. Vikram Rao","Dr. Snehal Sharma","Dr. Rohini Jain",
                "Dr. Aditya Gupta","Dr. Meera Reddy","Dr. Pavan Menon",
                "Dr. Kavitha Das","Dr. Swaroop Kapoor","Dr. Manoj Patil",
                "Dr. Tanvi Iyer","Dr. Harish Verma","Dr. Aarti Rao",
                "Dr. Nikhil Kulkarni","Dr. Suresh Jain","Dr. Lavanya Sharma"
            };
            return doctors;
        }

        else if (specialization == "Nuclear Medicine") {
            String[] doctors = {
                "Dr. Nitin Rao","Dr. Meera Sharma","Dr. Rohit Jain",
                "Dr. Sneha Gupta","Dr. Aditya Reddy","Dr. Kavitha Menon",
                "Dr. Swaroop Das","Dr. Pavan Iyer","Dr. Tanvi Kapoor",
                "Dr. Harini Patil","Dr. Manoj Verma","Dr. Aishwarya Rao",
                "Dr. Gaurav Jain","Dr. Sagar Kulkarni","Dr. Deepika Shetty"
            };
            return doctors;
        }
		else if(specialization == "Anesthesiology"){
    String[] doctors = {
        "Dr.Rohit Sharma","Dr.Ananya Rao","Dr.Vikram Desai","Dr.Sindhu Nair","Dr.Kunal Mehta",
        "Dr.Pallavi Shetty","Dr.Rajeev Menon","Dr.Deepthi Reddy","Dr.Abhishek Jain","Dr.Naveena Pillai",
        "Dr.Harsha Vardhan","Dr.Preeti Kulkarni","Dr.Sameer Khan","Dr.Lavanya Iyer","Dr.Girish Patil"
    };
    return doctors;
}

else if(specialization == "Allergy and Immunology"){
    String[] doctors = {
        "Dr.Aditi Kapoor","Dr.Rohan Bhat","Dr.Snehal Gupta","Dr.Madhav Rao","Dr.Shruti Nambiar",
        "Dr.Karthik Verma","Dr.Priyanshi Das","Dr.Ajay Thakur","Dr.Simran Kaur","Dr.Hemanth R",
        "Dr.Nikita Sinha","Dr.Yash Malhotra","Dr.Tanvi Shah","Dr.Raghav Chandra","Dr.Meera Thomas"
    };
    return doctors;
}

else if(specialization == "Andrology"){
    String[] doctors = {
        "Dr.Arun Prakash","Dr.Sanjay Kulkarni","Dr.Vivek Reddy","Dr.Manohar Rao","Dr.Akash Nair",
        "Dr.Nitin Arora","Dr.Ramesh Gowda","Dr.Kapil Dev","Dr.Sachin Rao","Dr.Rohini Bhat",
        "Dr.Shiv Kumar","Dr.Pradeep Shetty","Dr.Manoj Pillai","Dr.Harini Rao","Dr.Suresh Iyer"
    };
    return doctors;
}

else if(specialization == "Bariatric Surgery"){
    String[] doctors = {
        "Dr.Karthik Rao","Dr.Anusha R","Dr.Vinod Menon","Dr.Abhay Kulkarni","Dr.Shravan Kumar",
        "Dr.Lakshmi Narayan","Dr.Nikhita Jain","Dr.Rajat Mehra","Dr.Deepak Shetty","Dr.Swathi R",
        "Dr.Kiran Bhat","Dr.Prashanth Hegde","Dr.Pooja Sharma","Dr.Adarsh Gowda","Dr.Harsha N"
    };
    return doctors;
}

else if(specialization == "Colorectal Surgery"){
    String[] doctors = {
        "Dr.Rajesh Kumar","Dr.Shalini Rao","Dr.Vikas Patil","Dr.Amrita Singh","Dr.Ravi Teja",
        "Dr.Kavitha Menon","Dr.Satish Babu","Dr.Priyanka Jain","Dr.Murali Krishna","Dr.Aarti Desai",
        "Dr.Kishore Reddy","Dr.Anil Bhat","Dr.Varsha Kulkarni","Dr.Manoj Verma","Dr.Sonia Kapoor"
    };
    return doctors;
}

else if(specialization == "Clinical Pharmacology"){
    String[] doctors = {
        "Dr.Ashok Rao","Dr.Neha Gupta","Dr.Rakesh Iyer","Dr.Pooja Menon","Dr.Dinesh Kumar",
        "Dr.Malini Nair","Dr.Rahul Shetty","Dr.Kavya Sharma","Dr.Sameera Khan","Dr.Abhay Singh",
        "Dr.Priya Nambiar","Dr.Ganesh Patil","Dr.Tarun Bhat","Dr.Ritika Shah","Dr.Harsha Kulkarni"
    };
    return doctors;
}

else if(specialization == "Hepatology"){
    String[] doctors = {
        "Dr.Sanjana Rao","Dr.Ajay Menon","Dr.Vishal Shetty","Dr.Anupama R","Dr.Rohit Nair",
        "Dr.Krishna Murthy","Dr.Nisha Patel","Dr.Arvind Kumar","Dr.Lavanya S","Dr.Pradeep Rao",
        "Dr.Aditi Nambiar","Dr.Karan Mehta","Dr.Sowmya Iyer","Dr.Sharath Babu","Dr.Ritika Jain"
    };
    return doctors;
}

else if(specialization == "Sports Medicine"){
    String[] doctors = {
        "Dr.Abhishek Rao","Dr.Preeti Sharma","Dr.Sachin Patil","Dr.Nidhi Kapoor","Dr.Karthik R",
        "Dr.Amogh Shetty","Dr.Shraddha Nair","Dr.Rohini Rao","Dr.Hemanth Kumar","Dr.Varun Iyer",
        "Dr.Ajay Singh","Dr.Kruthi Bhat","Dr.Sandeep Jain","Dr.Anusha Menon","Dr.Prakash Gowda"
    };
    return doctors;
}

else if(specialization == "Sleep Medicine"){
    String[] doctors = {
        "Dr.Nikhil Rao","Dr.Madhuri Desai","Dr.Vinay Kumar","Dr.Sneha Reddy","Dr.Rajiv Menon",
        "Dr.Tanvi Nair","Dr.Abhay Patil","Dr.Riya Sharma","Dr.Sharan Gowda","Dr.Kavitha Rao",
        "Dr.Amit Kulkarni","Dr.Divya Shetty","Dr.Rahul Jain","Dr.Sowmya Patil","Dr.Girish Nair"
    };
    return doctors;
}

else if(specialization == "Preventive Medicine"){
    String[] doctors = {
        "Dr.Swetha Rao","Dr.Raghavendra B","Dr.Anjali Mehta","Dr.Santosh Kumar","Dr.Krishna Nair",
        "Dr.Pallavi Jain","Dr.Suresh Rao","Dr.Akanksha Singh","Dr.Harish Patil","Dr.Namrata Bhat",
        "Dr.Rajeshwari N","Dr.Vikram Shetty","Dr.Ashwini Desai","Dr.Neeraj Gupta","Dr.Prerna Kapoor"
    };
    return doctors;
}

else if(specialization == "Forensic Medicine"){
    String[] doctors = {
        "Dr.Abhilash Rao","Dr.Manjula N","Dr.Ritesh Kumar","Dr.Sonia Sharma","Dr.Avinash Patil",
        "Dr.Deepika Rao","Dr.Santosh Shetty","Dr.Akshara Nair","Dr.Kiran Reddy","Dr.Prasad Kulkarni",
        "Dr.Megha Jain","Dr.Naveen Rao","Dr.Harini Patil","Dr.Rohit Kumar","Dr.Aishwarya Desai"
    };
    return doctors;
}

else if(specialization == "Community Medicine"){
    String[] doctors = {
        "Dr.Sharath Rao","Dr.Anusha Jain","Dr.Ravi Kumar","Dr.Priya Patil","Dr.Manish Nair",
        "Dr.Sindhu Rao","Dr.Sagar Kulkarni","Dr.Kavitha Menon","Dr.Rohini Shetty","Dr.Abhay R",
        "Dr.Tejas Patil","Dr.Sahana Bhat","Dr.Sameer Rao","Dr.Nikita Jain","Dr.Vikas Nair"
    };
    return doctors;
}

else if(specialization == "Reproductive Medicine"){
    String[] doctors = {
        "Dr.Anita Rao","Dr.Kiran Patil","Dr.Meera Jain","Dr.Rahul Shetty","Dr.Shruthi Nair",
        "Dr.Satish Kumar","Dr.Abhay Rao","Dr.Divya Menon","Dr.Nisha Kulkarni","Dr.Praveen R",
        "Dr.Pallavi Jain","Dr.Harish Bhat","Dr.Krishna Patil","Dr.Sanjana Rao","Dr.Manoj Shetty"
    };
    return doctors;
}

else if(specialization == "Cosmetic Surgery"){
    String[] doctors = {
        "Dr.Akshay Rao","Dr.Ananya Patil","Dr.Samir Jain","Dr.Nikita Shetty","Dr.Rohit Kumar",
        "Dr.Priyanka Rao","Dr.Karan Mehta","Dr.Aditi Nair","Dr.Siddharth Rao","Dr.Rachana Patil",
        "Dr.Abhishek Jain","Dr.Swathi Menon","Dr.Sharath Iyer","Dr.Madhavi Rao","Dr.Vinay Patil"
    };
    return doctors;
}

else if(specialization == "Clinical Psychology"){
    String[] doctors = {
        "Dr.Anjali Rao","Dr.Ritika Sharma","Dr.Sameer Nair","Dr.Kavya Jain","Dr.Abhay Kumar",
        "Dr.Shruthi Rao","Dr.Naman Patel","Dr.Pallavi Desai","Dr.Vivek Menon","Dr.Aishwarya Patil",
        "Dr.Harsha Rao","Dr.Sowmya Jain","Dr.Rohan Shetty","Dr.Divya Kapoor","Dr.Satish Rao"
    };
    return doctors;
}
        else {
            System.out.println("Specialization Not Found: " + specialization);
            return null;
        }
    }

    public static void getDoctors(String[] doctors){
		System.out.println("\nFetching Doctors....");
		
			for(String doctor : doctors){
				System.out.println(doctor);
			}
			System.out.println("\nDoctors lists are here...");
	}
}

