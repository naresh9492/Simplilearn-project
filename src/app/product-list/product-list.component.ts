import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  pageTitle: string = "Product List Page"
  src = 'https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png';

  constructor() { }

  ngOnInit(): void {
  }

}
