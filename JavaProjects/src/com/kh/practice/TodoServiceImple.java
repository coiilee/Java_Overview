

import com.kh.practice.TodoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoServiceImple implements TodoService {
    @Override
    public Map<String, String> todoListFullView() {
        Map<String, String> todoList = new HashMap<>();

         todoList.put("카페가기","카페가서 코딩");
         todoList.put("잠자기","최소 7시간 이상 수면 유지 ");
            return todoList;
}
    @Override
    public int todoAdd(String title, String detail) {
        int startId = 1; //할일 id를 관리하는 변수명, 할일 시작 번호는 1
        Map<String, String> todoList = new HashMap<>();
        todoList.put("카페가기","카페가서 코딩");
//        todoList.put("잠자기","최소 7시간 이상 수면 유지 ");
        return startId++; //할 일이 추가될 때마다 ++
    }

    @Override
    public boolean todoUpdate(int index, String title, String detail) {
        Map<String,String>taskDetails = new HashMap<>();
        taskDetails.get(index); //가져오고자 하는 id나 할일 제목을 가져와서 가져오기

        //수정하기 기능을 사용해서 수정하기
        taskDetails.put("title","제목 수정하기");
        taskDetails.put("detail","상세 내용 수정하기");
        //업데이트가 무사히 됐다면 true, 무사히 되지 않았다면 false 
        return false;
    }
}
