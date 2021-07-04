package service;


import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper mapper;

    public List<Test> getTestList(){
        return mapper.getPost();
    }

    public void insertTest(Test test) {
        mapper.insertPost(test);
    }

    public void insertLikes(Test likes) {
        mapper.insertLikes(likes);
    }
}
