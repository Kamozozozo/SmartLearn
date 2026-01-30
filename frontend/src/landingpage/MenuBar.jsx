import React from 'react'
function MenuBar() {
    
    return (
        <nav className="flex items-center justify-end px-6 md:px-16 lg:px-24 xl:px-32 py-4 border-b border-gray-300 bg-white relative transition-all " >
            <div className="hidden sm:flex items-center gap-8">
                <a href="#">Presentaions</a>
                <a href="#">Jobs</a>
                <a href="#">Sponsors</a>
                <button className="cursor-pointer px-8 py-2 bg-gray-300 hover:bg-gray-100 transition text-black rounded-full">
                    Login
                </button>
                <button className="cursor-pointer px-8 py-2 bg-black hover:bg-gray-400 transition text-white rounded-full">
                    Register
                </button>
            </div>
           

        </nav>
    )
}

export default MenuBar