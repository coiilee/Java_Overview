package com.kh.practiceEx.dbPre.arrayPre;

import com.kh.practiceEx.dbPre.Employee;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//EmployeeService 가져와서 override 생성
public class EmployeeServiceImpl implements EmployeeService {
    //String = 사원 id 가져오는 문자열 Employee = ID에 해당하는 사원 정보
    public Map<String ,Employee> employeeMap = new HashMap<String,Employee>();


    @Override
    public void addEmployee(Employee employee) {
        //추가할 사원 정보 put저장, 사원등록을 할 때마다
        //몇번째로 가입한 사원인지 자동으로 count를 진행할 것
        //사원정보를 모두 저장
            employeeMap.put(employee.getEmp_id(),employee);
    }

    @Override
    public void updateEmployee(String emp_name, String email, String phone, String dept_code, String job_code, String sal_level, double salary, double bonus, String manager_id, Date ent_date, Date ent_yn) {
            System.out.println("정보 저장하고자 하는 코드 작성");
    }

    @Override
    public void deleteEmployee(String emp_id, String emp_name, String email, char ent_yn) {
            //삭제하고자 하는 직원의 id나 이름 이메일 퇴사여부를 작성하고
            //만약 일치하는 사원번호가 존재한다면
            Employee employee = employeeMap.get(emp_id); //DB에 있는 사원번호 가져오기
        //DB 에서 가져온 회원 정보가 존재한다면
        // ==null 가져온 값이 없음 != null 가져온 값이 존재함
            if (employee != null) { //사원을 조회했을 때 조회한 정보가 존재한다면
                employeeMap.remove(emp_id); //삭제
                System.out.println("사원 정보를 제거했습니다.");
            } else {
                System.out.println("일치하는 회원정보를 찾을 수 없습니다.");
            }
    }

    @Override
    public void viewEmployee(String emp_id, String emp_name, String email) {
        Employee employee = employeeMap.get(emp_id);
        if (employee != null) {
            System.out.println(employee.toString());
        } else {
            System.out.println("사원번호, 이름, 이메일과 일치하는 정보가 없습니다.");
            System.out.println("확인하고 다시 조회해주세요");
        }
    }

    @Override
    public void viewEmployee(String phone, String emp_name) {

    }

    @Override
    public void viewEmployee(String info_emp) { //info_emp = emp_id 도는 emp_name 또는  emp_email 중 하나라도 일치하는 사원 조회

        //info_emp = 사원번호 or 이름 or 이메일 or 핸드폰번호를 조회했을 때 일치하는 사원이 존재한다면
        Employee employee = employeeMap.get(info_emp);
        if (employee != null) { //조회하고자 하는 정보가일치하는 사원이 존재할 때
            System.out.println(employee.toString()); //정보 출력
        } else {
            System.out.println("사원번호, 이름, 이메일과 일치하는 정보가 없습니다.");
            System.out.println("확인하고 다시 조회해주세요");
        }
    }

    @Override
    public void loginEmployee(String emp_name, String email) { //동명이인일 경우 이름과 이메일이 일치하는 사원 정보 조회
        Employee employee = employeeMap.get(emp_name);
        if (employee != null) {
            System.out.println(employee.toString());
        } else {
            System.out.println("일치하는 사원 정보가 없습니다.");
        }
    }
}
