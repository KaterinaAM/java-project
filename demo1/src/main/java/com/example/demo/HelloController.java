@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        return "hello";
    }
}
