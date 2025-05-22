import React, { useState } from 'react';
import Login from './Login';
import Home from './Home';

function App() {
    const [loggedIn, setLoggedIn] = useState(false);

    return (
        <div>
            {loggedIn ? <Home /> : <Login setLoggedIn={setLoggedIn} />}
        </div>
    );
}

export default App;
