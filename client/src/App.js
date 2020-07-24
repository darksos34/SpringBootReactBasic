import './App.css';
import React  from "react";

//Material UI style button
import {Button, Grid} from "@material-ui/core";


function App() {


    return (
        <Grid>
            <div className="App">
                <div>
                    <h1>Administrative reactive</h1>
                    <p>1.0</p>

                    <Button type="submit" variant="contained">Erwins Enter</Button>
                </div>

            </div>
        </Grid>
    );
}

export default App;
