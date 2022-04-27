import React from "react";
import logo from "../logo.png";
import moment from "moment";

const Weather = ({ data }) => {

    return data.id ? (
        <div className="details">
            <div className="left-side">
                <div className="img-cover">
                    <img src={logo} />
                </div>
                <div className="degree">
                    <h1>{data.main && data.main.temp}</h1>
                    <span>°C</span>
                </div>
                <ul>
                    <li>Pressure: {data.main && data.main.pressure}%</li>
                    <li>Humudity: {data.main && data.main.humidity}%</li>
                    <li>
                        Wind: {data.wind && data.wind.speed}km/h -{" "}
                        {data.wind && data.wind.deg} Deg
                    </li>
                </ul>
            </div>
            <div className="right-side">
                <h1 className="city-name">{data.name}</h1>
                <div className="coordinate">
                    <h2> lon:{data.coord && data.coord.lon}</h2>
                    
                    <h2> lat:{data.coord && data.coord.lat}</h2>
                </div>
                <div className="date">
                    {`${moment(data.dt).format("dddd")} ${moment(data.dt).format("LT")}`}                    
                </div>
                <div className="weather">
                    {data.weather && data.weather.description}
                </div>
            </div>
        </div>
    ) : (
        <div className="error">
            <h2>City is not found.</h2>
        </div>
    );
};

export default Weather;
