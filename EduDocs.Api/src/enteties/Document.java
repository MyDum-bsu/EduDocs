package enteties;

import enteties.utils.DocumentType;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

public class Document {
    UUID uuid;
    DocumentType type;
    Timestamp created;
    Date validThrough;
    AdministrationMember origin;
}
