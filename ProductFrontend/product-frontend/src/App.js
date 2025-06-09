import './App.css';
import { ProductGrid } from './Components/ProductGrid';
import { ProductForm } from './Components/ProductForm';

function App() {
  return (
    <div >
       <div class="p-4 container-fluid text-center text-white bg-info">
      <h1>Welcome to Products</h1>
    </div>
      <div class="row">
        <div class="col-sm-4"></div>
        <div class="col-sm-4">
          <ProductForm/>
        </div>
        <div class="col-sm-4"></div>
      </div>
      <hr></hr>
      <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8">
        <h2>Product List</h2>
          <ProductGrid />
        </div>
        <div class="col-sm-2"></div>
      </div>

    </div>
  );
}

export default App;
