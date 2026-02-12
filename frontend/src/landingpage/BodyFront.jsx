import React from 'react';
import Highlights from './Highlights';
const BodyFront = () => {
  return (
    <>
    <div className="pt-40 w-screen overflow-hidden border-b border-gray-300 bg-gray py-8">
    <div className="grid gap-10">      
      <div className=" text-center">
        <span className='font-bold text-3xl md:text-5xl lg:text-6xl text-foreground font-serif font-bold'>WELCOME TO</span>
        <br></br>
        <span className='font-bold text-6xl md:text-8xl lg:text-9xl text-primary font-serif font-bold'>
        STARTUP HUB
        </span>
      </div>
      <div className="overflow-hidden w-screen">
        <div className="text-gray-500 text-1xl md:text-4xl lg:text-5xl whitespace-nowrap w-max animate-marquee">
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