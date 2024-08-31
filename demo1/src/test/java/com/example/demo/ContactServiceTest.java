@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactServiceTest {

    @Autowired
    private ContactService contactService;

    @MockBean
    private ContactRepository contactRepository;

    @Test
    public void testSaveContact() {
        Contact contact = new Contact();
        contact.setName("Test Name");
        contact.setPhoneNumber("123456789");

        when(contactRepository.save(contact)).thenReturn(contact);

        Contact savedContact = contactService.saveContact(contact);
        assertEquals("Test Name", savedContact.getName());
        assertEquals("123456789", savedContact.getPhoneNumber());
    }
}
