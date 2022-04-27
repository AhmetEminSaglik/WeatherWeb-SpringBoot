import React, { useState } from "react";
import Form from "./components/form";
import useWeather from "./components/hooks/useWeather";
import Weather from "./components/weather";

const App = () => {
    const [city, setCity] = useState("");

    const weatherData = useWeather(city);

    return (
        <div className="container">
            <Form setCity={setCity} />
            <Weather data={weatherData} />
        </div>
    );
};

export default App;
