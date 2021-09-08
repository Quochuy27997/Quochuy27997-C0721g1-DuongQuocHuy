package _16_doc_ghi_file.bai_tap.doc_file_csv;

public class Country {

        private int id;
        private String code;
        private String name;

        public Country(int id, String code, String nameCountry) {
            this.id = id;
            this.code = code;
            this.name = nameCountry;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString(){
            return this.getId()+","+this.getCode()+","+this.getName();
        }
    }

