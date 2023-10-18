package seedu.address.model.util;

import static seedu.address.model.util.SampleDataUtil.getTagSet;

import seedu.address.model.company.Company;
import seedu.address.model.company.CompanyEmail;
import seedu.address.model.company.CompanyName;
import seedu.address.model.company.CompanyPhone;
import seedu.address.model.company.Description;

/**
 * Returns some sample data for companies.
 */
public class CompanySampleDataUtil {
    public static Company[] getSampleCompanies() {
        return new Company[] {
            new Company(
                    new CompanyName("Apple Inc."), new CompanyPhone("12345678"), new CompanyEmail("apple@example.com"),
                    new Description("A technology company."), getTagSet("tech", "innovative", "MANGA")),
            new Company(
                    new CompanyName("Microsoft Corporation"), new CompanyPhone("23456789"),
                    new CompanyEmail("microsoft@example.com"),
                    new Description("A multinational technology company."), getTagSet("tech", "windows")),
            new Company(
                    new CompanyName("Google LLC"), new CompanyPhone("34567890"), new CompanyEmail("google@example.com"),
                    new Description("An internet-related services and products company."),
                    getTagSet("tech", "search", "MANGA")),
            new Company(
                    new CompanyName("Amazon.com Inc."),
                    new CompanyPhone("45678901"), new CompanyEmail("amazon@example.com"),
                    new Description("An online retailer and cloud services company."), getTagSet()),
            new Company(
                    new CompanyName("Netflix Inc."),
                    new CompanyPhone("56789012"), new CompanyEmail("netflix@example.com"),
                    new Description("A streaming service company."), getTagSet()),
            new Company(
                    new CompanyName("Facebook, Inc."),
                    new CompanyPhone("67890123"), new CompanyEmail("facebook@example.com"),
                    new Description("A social media and technology company."),
                    getTagSet("social", "advertising")),
            new Company(
                    new CompanyName("Tesla, Inc."),
                    new CompanyPhone("78901234"), new CompanyEmail("tesla@example.com"),
                    new Description("An electric vehicle and clean energy company."),
                    getTagSet("automotive", "sustainability"))
        };

    }
}
