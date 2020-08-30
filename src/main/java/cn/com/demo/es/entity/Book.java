package cn.com.demo.es.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
@Data
@Document(indexName="libs_index",type = "Ib_book")
public class Book implements Serializable{
        @Id
        private int bkId;

        @Field(type = FieldType.Text,analyzer = "ik_max_word")
        private String bkName;

        @Field(type = FieldType.Double)
        private double bkPrice;

        @Field(type = FieldType.Text,analyzer = "ik_max_word")
        private String bkAuthor;

        @Field(type = FieldType.Text,analyzer = "ik_max_word")
        private String bkDesc;




        @Override
        public String toString() {
                return "Book{" +
                        "bkId=" + bkId +
                        ", bkName='" + bkName + '\'' +
                        ", bkPrice=" + bkPrice +
                        ", bkAuthor='" + bkAuthor + '\'' +
                        ", bkDesc='" + bkDesc + '\'' +
                        '}';
        }
}
