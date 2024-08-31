@RunWith(SpringRunner.class)
@WebMvcTest(ContactController.class)
public class ContactControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContactService contactService;

    @Test
    public void testGetContacts() throws Exception {
        mockMvc.perform(get("/contacts"))
                .andExpect(status().isOk())
                .andExpect(view().name("contact_list"));
    }
}
