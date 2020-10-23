package com.PODownload.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Primary;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class POModel {

   int PO_number;
   String PO_date;
   String PO_address;
   int PO_line_number;
   int UPC_number;
   String UPC_name;
   int ordered_quantity;

}

