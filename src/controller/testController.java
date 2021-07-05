package controller;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")

public class testController {

    @Autowired
    TestService testService;

    @GetMapping("")
    public String getTest() {
        return "hello";
    }

    /*@GetMapping("/asdf")
    public Test getTest2() {
        Test test = new Test();
        test.setGender("남자");
        test.setName("");
        test.setPhone("1242412");
        return test;
    }*/
    @GetMapping("/testm")
    public List<Test> getTestList() {
        return testService.getTestList();
    }

    @PostMapping("/posttest")
    public void insertTPost(@RequestBody Test test){
        testService.insertTest(test);
    }

    @PostMapping("/likes")
    public void insertLikes(@RequestBody Test likes){
        testService.insertLikes(likes);
    }

    @PostMapping("hitscn")
    public void updateHitsCount(@RequestBody Test hitcn) {testService.updateHitsCount(hitcn);}
}
