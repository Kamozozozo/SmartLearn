import React from 'react';

const Highlights = () => {
  return (
    <div className="py-4 ">
      <div className="flex overflow-x-auto space-x-4 px-4 scrollbar-hid no-scrollbar">
      
        <div className="flex-shrink-0 w-[33.33vw] h-60 bg-red-50 rounded-xl shadow-lg flex items-center justify-center">
          div1
        </div>
        <div className="flex-shrink-0 w-[33.33vw] h-60 bg-blue-50 rounded-xl shadow-lg flex items-center justify-center">
          div2
        </div>
        <div className="flex-shrink-0 w-[33.33vw] h-60 bg-green-50 rounded-xl shadow-lg flex items-center justify-center">
          div3
        </div>
        <div className="flex-shrink-0 w-[33.33vw] h-60 bg-yellow-50 rounded-xl shadow-lg flex items-center justify-center">
          div4
        </div>
        <div className="flex-shrink-0 w-[33.33vw] h-60 bg-purple-50 rounded-xl shadow-lg flex items-center justify-center">
          div5
        </div>
        <div className="flex-shrink-0 w-[33.33vw] h-60 bg-pink-50 rounded-xl shadow-lg flex items-center justify-center">
          div6
        </div>
      </div>
    </div>
  );
};

export default Highlights;
