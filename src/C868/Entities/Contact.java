package C868.Entities;

/**
 * This is the class for the Contact object
 * @author Patrick Denney
 */

public class Contact {
    private int contactID;
    private String contactName;
    private String email;

    /**
     * This is the constructor method for the Contact object
     * @param contactID ID number generated by the database for the contact
     * @param contactName Name of the contact
     * @param email email address for the contact
     */
    public Contact(int contactID, String contactName, String email) {
        this.contactID = contactID;
        this.contactName = contactName;
        this.email = email;
    }

    /**
     *
     * @return Returns the contact ID for the contact.
     */
    public int getContactID() {
        return contactID;
    }

    /**
     *
     * @return Returns the name for the contact.
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the name for the contact.
     * @param contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     *
     * @return Returns the email address for the contact.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address for the contact.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}