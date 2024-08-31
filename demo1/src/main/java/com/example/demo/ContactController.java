@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public String listContacts(Model model) {
        model.addAttribute("contacts", contactService.getAllContacts());
        return "contact_list";
    }

    @PostMapping("/contacts")
    public String addContact(@ModelAttribute Contact contact) {
        contactService.saveContact(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/contacts/new")
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact_form";
    }
}
