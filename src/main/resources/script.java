class Script {
    static String input =
            "    <option value=\"1\">Manufacturing</option>\n" +
                    "    <option value=\"19\">&nbsp;&nbsp;&nbsp;&nbsp;Construction materials</option>\n" +
                    "    <option value=\"18\">&nbsp;&nbsp;&nbsp;&nbsp;Electronics and Optics</option>\n" +
                    "    <option value=\"6\">&nbsp;&nbsp;&nbsp;&nbsp;Food and Beverage</option>\n" +
                    "    <option value=\"342\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bakery &amp; confectionery products</option>\n" +
                    "    <option value=\"43\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Beverages</option>\n" +
                    "    <option value=\"42\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Fish &amp; fish products </option>\n" +
                    "    <option value=\"40\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Meat &amp; meat products</option>\n" +
                    "    <option value=\"39\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Milk &amp; dairy products </option>\n" +
                    "    <option value=\"437\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other</option>\n" +
                    "    <option value=\"378\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Sweets &amp; snack food</option>\n" +
                    "    <option value=\"13\">&nbsp;&nbsp;&nbsp;&nbsp;Furniture</option>\n" +
                    "    <option value=\"389\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bathroom/sauna </option>\n" +
                    "    <option value=\"385\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bedroom</option>\n" +
                    "    <option value=\"390\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Children’s room </option>\n" +
                    "    <option value=\"98\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Kitchen </option>\n" +
                    "    <option value=\"101\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Living room </option>\n" +
                    "    <option value=\"392\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Office</option>\n" +
                    "    <option value=\"394\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other (Furniture)</option>\n" +
                    "    <option value=\"341\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Outdoor </option>\n" +
                    "    <option value=\"99\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Project furniture</option>\n" +
                    "    <option value=\"12\">&nbsp;&nbsp;&nbsp;&nbsp;Machinery</option>\n" +
                    "    <option value=\"94\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Machinery components</option>\n" +
                    "    <option value=\"91\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Machinery equipment/tools</option>\n" +
                    "    <option value=\"224\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Manufacture of machinery </option>\n" +
                    "    <option value=\"97\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Maritime</option>\n" +
                    "    <option value=\"271\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Aluminium and steel workboats </option>\n" +
                    "    <option value=\"269\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Boat/Yacht building</option>\n" +
                    "    <option value=\"230\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Ship repair and conversion</option>\n" +
                    "    <option value=\"93\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metal structures</option>\n" +
                    "    <option value=\"508\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other</option>\n" +
                    "    <option value=\"227\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Repair and maintenance service</option>\n" +
                    "    <option value=\"11\">&nbsp;&nbsp;&nbsp;&nbsp;Metalworking</option>\n" +
                    "    <option value=\"67\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Construction of metal structures</option>\n" +
                    "    <option value=\"263\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Houses and buildings</option>\n" +
                    "    <option value=\"267\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metal products</option>\n" +
                    "    <option value=\"542\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metal works</option>\n" +
                    "    <option value=\"75\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CNC-machining</option>\n" +
                    "    <option value=\"62\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Forgings, Fasteners </option>\n" +
                    "    <option value=\"69\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gas, Plasma, Laser cutting</option>\n" +
                    "    <option value=\"66\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MIG, TIG, Aluminum welding</option>\n" +
                    "    <option value=\"9\">&nbsp;&nbsp;&nbsp;&nbsp;Plastic and Rubber</option>\n" +
                    "    <option value=\"54\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Packaging</option>\n" +
                    "    <option value=\"556\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastic goods</option>\n" +
                    "    <option value=\"559\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastic processing technology</option>\n" +
                    "    <option value=\"55\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Blowing</option>\n" +
                    "    <option value=\"57\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Moulding</option>\n" +
                    "    <option value=\"53\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastics welding and processing</option>\n" +
                    "    <option value=\"560\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plastic profiles</option>\n" +
                    "    <option value=\"5\">&nbsp;&nbsp;&nbsp;&nbsp;Printing </option>\n" +
                    "    <option value=\"148\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Advertising</option>\n" +
                    "    <option value=\"150\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Book/Periodicals printing</option>\n" +
                    "    <option value=\"145\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Labelling and packaging printing</option>\n" +
                    "    <option value=\"7\">&nbsp;&nbsp;&nbsp;&nbsp;Textile and Clothing</option>\n" +
                    "    <option value=\"44\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Clothing</option>\n" +
                    "    <option value=\"45\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Textile</option>\n" +
                    "    <option value=\"8\">&nbsp;&nbsp;&nbsp;&nbsp;Wood</option>\n" +
                    "    <option value=\"337\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other (Wood)</option>\n" +
                    "    <option value=\"51\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Wooden building materials</option>\n" +
                    "    <option value=\"47\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Wooden houses</option>\n" +
                    "    <option value=\"3\">Other</option>\n" +
                    "    <option value=\"37\">&nbsp;&nbsp;&nbsp;&nbsp;Creative industries</option>\n" +
                    "    <option value=\"29\">&nbsp;&nbsp;&nbsp;&nbsp;Energy technology</option>\n" +
                    "    <option value=\"33\">&nbsp;&nbsp;&nbsp;&nbsp;Environment</option>\n" +
                    "    <option value=\"2\">Service</option>\n" +
                    "    <option value=\"25\">&nbsp;&nbsp;&nbsp;&nbsp;Business services</option>\n" +
                    "    <option value=\"35\">&nbsp;&nbsp;&nbsp;&nbsp;Engineering</option>\n" +
                    "    <option value=\"28\">&nbsp;&nbsp;&nbsp;&nbsp;Information Technology and Telecommunications</option>\n" +
                    "    <option value=\"581\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Data processing, Web portals, E-marketing</option>\n" +
                    "    <option value=\"576\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Programming, Consultancy</option>\n" +
                    "    <option value=\"121\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Software, Hardware</option>\n" +
                    "    <option value=\"122\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Telecommunications</option>\n" +
                    "    <option value=\"22\">&nbsp;&nbsp;&nbsp;&nbsp;Tourism</option>\n" +
                    "    <option value=\"141\">&nbsp;&nbsp;&nbsp;&nbsp;Translation services</option>\n" +
                    "    <option value=\"21\">&nbsp;&nbsp;&nbsp;&nbsp;Transport and Logistics</option>\n" +
                    "    <option value=\"111\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Air</option>\n" +
                    "    <option value=\"114\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Rail</option>\n" +
                    "    <option value=\"112\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Road</option>\n" +
                    "    <option value=\"113\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Water</option>\n";

    public static void main(String[] args) {
        generateInsertStatements(input);
    }

    public static void generateInsertStatements(String input) {
        input = input.replace("&amp;", "&");

        Integer parentId;
        Integer[] parents = new Integer[10];

        System.out.println("databaseChangeLog:");
        System.out.println("  - changeSet:");
        System.out.println("      id: insert-sectors");
        System.out.println("      author: aljona");
        System.out.println("      changes:");

        for (String row : input.split("\n")) {
            if (!row.contains("<option")) continue;

            int id = Integer.parseInt(row.substring(row.indexOf("=") + 2, row.indexOf(">") - 1));
            String name = row.substring(row.indexOf(">") + 1, row.lastIndexOf("</"));

            int level = 0;
            if (row.contains("&nbsp;")) {
                name = row.substring(row.lastIndexOf(";") + 1, row.lastIndexOf("</")).trim();
                level = (row.split("&nbsp;").length - 1) / 4;
            }

            parents[level] = id;
            if (level == 0) parentId = null;
            else parentId = parents[level - 1];

            String yaml = String.format(
                    "        - insert:\n" +
                            "            tableName: sector\n" +
                            "            columns:\n" +
                            "              - column: { name: id, value: %d }\n" +
                            "              - column: { name: name, value: \"%s\" }\n" +
                            "              - column: { name: parent_id, value: %s }\n" +
                            "              - column: { name: created_date, valueDate: CURRENT_TIMESTAMP }",
                    id,
                    name.replace("\"", "\\\""),
                    parentId == null ? "null" : parentId.toString()
            );

            System.out.println(yaml);
        }
    }
}