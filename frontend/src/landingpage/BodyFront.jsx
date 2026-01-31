import React from 'react';
import Highlights from './Highlights';
const BodyFront = () => {
  return (
    <>
    <div className="pt-40 w-screen overflow-hidden border-b border-gray-300 bg-white py-8">
    <div className="grid gap-10">      
      <div className="font-bold text-6xl md:text-8xl lg:text-9xl text-center">
        startuphub
      </div>
      <div className="overflow-hidden w-screen">
        <div className="text-gray-500 text-2xl md:text-4xl lg:text-5xl whitespace-nowrap w-max animate-marquee">
          Allow your idea to shine by getting investors and find co-founders like you to collaborate.
          &nbsp;&nbsp;&nbsp;
          Allow your idea to shine by getting investors and find co-founders like you to collaborate.
        </div>
      </div>

    </div>
  </div>
  <Highlights/>

    </>
  )
}

export default BodyFront