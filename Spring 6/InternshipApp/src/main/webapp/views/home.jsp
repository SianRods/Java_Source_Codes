<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Internship Portal - Find Your Dream Career</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content="Discover internship opportunities and connect with top companies. Your career journey starts here."/>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: 'Inter', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #f8fafc 0%, #f1f5f9 100%);
            line-height: 1.6;
            color: #374151;
        }

        /* Navigation Header */
        .navbar {
            background: #ffffff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            padding: 1rem 0;
            position: sticky;
            top: 0;
            z-index: 100;
            border-bottom: 1px solid #e5e7eb;
        }

        .nav-container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 2rem;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .logo {
            font-size: 1.5rem;
            font-weight: 700;
            color: #1e293b;
            text-decoration: none;
            display: flex;
            align-items: center;
            gap: 0.5rem;
        }

        .logo-icon {
            width: 32px;
            height: 32px;
            background: linear-gradient(135deg, #3b82f6, #06b6d4);
            border-radius: 8px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: white;
            font-weight: bold;
        }

        .nav-links {
            display: flex;
            gap: 2rem;
            list-style: none;
            margin: 0;
            padding: 0;
        }

        .nav-links a {
            text-decoration: none;
            color: #6b7280;
            font-weight: 500;
            transition: color 0.2s ease;
            padding: 0.5rem 1rem;
            border-radius: 6px;
            transition: all 0.2s ease;
        }

        .nav-links a:hover {
            color: #3b82f6;
            background: #f3f4f6;
        }

        .mobile-menu-btn {
            display: none;
            background: none;
            border: none;
            font-size: 1.5rem;
            color: #6b7280;
            cursor: pointer;
        }

        /* Hero Section */
        .hero {
            background: linear-gradient(135deg, #1e293b 0%, #334155 100%);
            color: white;
            padding: 4rem 2rem;
            text-align: center;
            position: relative;
            overflow: hidden;
        }

        .hero::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background: linear-gradient(135deg, rgba(59, 130, 246, 0.1), rgba(6, 182, 212, 0.1));
            pointer-events: none;
        }

        .hero-content {
            max-width: 800px;
            margin: 0 auto;
            position: relative;
            z-index: 2;
        }

        .hero h1 {
            font-size: 3rem;
            font-weight: 700;
            margin-bottom: 1rem;
            letter-spacing: -0.025em;
            line-height: 1.1;
        }

        .hero-subtitle {
            font-size: 1.25rem;
            margin-bottom: 2rem;
            opacity: 0.9;
            font-weight: 400;
        }

        .cta-button {
            display: inline-flex;
            align-items: center;
            gap: 0.5rem;
            background: #3b82f6;
            color: white;
            padding: 1rem 2rem;
            border-radius: 8px;
            text-decoration: none;
            font-weight: 600;
            font-size: 1.1rem;
            transition: all 0.2s ease;
            border: none;
            cursor: pointer;
        }

        .cta-button:hover {
            background: #2563eb;
            transform: translateY(-2px);
            box-shadow: 0 8px 25px rgba(59, 130, 246, 0.4);
        }

        /* Platform Info Section */
        .platform-info {
            padding: 4rem 2rem;
            background: white;
        }

        .section-container {
            max-width: 1200px;
            margin: 0 auto;
        }

        .section-title {
            text-align: center;
            font-size: 2.5rem;
            font-weight: 700;
            color: #1e293b;
            margin-bottom: 1rem;
        }

        .section-subtitle {
            text-align: center;
            font-size: 1.1rem;
            color: #64748b;
            margin-bottom: 3rem;
        }

        .features-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 2rem;
            margin-bottom: 3rem;
        }

        .feature-card {
            background: #f8fafc;
            padding: 2rem;
            border-radius: 12px;
            text-align: center;
            border: 1px solid #e2e8f0;
            transition: all 0.2s ease;
        }

        .feature-card:hover {
            transform: translateY(-4px);
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.1);
            border-color: #cbd5e1;
        }

        .feature-icon {
            width: 64px;
            height: 64px;
            background: linear-gradient(135deg, #3b82f6, #06b6d4);
            border-radius: 12px;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 1rem auto;
            font-size: 2rem;
            color: white;
        }

        .feature-title {
            font-size: 1.25rem;
            font-weight: 600;
            color: #1e293b;
            margin-bottom: 0.5rem;
        }

        .feature-description {
            color: #64748b;
            line-height: 1.6;
        }

        .stats-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
            gap: 2rem;
            margin-top: 3rem;
        }

        .stat-card {
            text-align: center;
            padding: 1.5rem;
        }

        .stat-number {
            font-size: 2.5rem;
            font-weight: 700;
            color: #3b82f6;
            margin-bottom: 0.5rem;
        }

        .stat-label {
            color: #64748b;
            font-weight: 500;
        }

        /* Main Options Section */
        .main-options {
            padding: 4rem 2rem;
            background: #f8fafc;
        }

        .options-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(320px, 1fr));
            gap: 2rem;
            max-width: 1000px;
            margin: 0 auto;
        }

        .option-card {
            background: white;
            padding: 2rem;
            border-radius: 16px;
            text-decoration: none;
            color: #374151;
            box-shadow: 0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06);
            border: 1px solid #e2e8f0;
            transition: all 0.2s ease;
            position: relative;
            overflow: hidden;
        }

        .option-card::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            height: 4px;
            background: linear-gradient(90deg, #3b82f6, #06b6d4);
            transform: scaleX(0);
            transition: transform 0.2s ease;
        }

        .option-card:hover {
            transform: translateY(-8px);
            box-shadow: 0 20px 25px -5px rgba(0, 0, 0, 0.1), 0 8px 10px -6px rgba(0, 0, 0, 0.1);
            border-color: #cbd5e1;
        }

        .option-card:hover::before {
            transform: scaleX(1);
        }

        .option-icon {
            width: 48px;
            height: 48px;
            background: linear-gradient(135deg, #3b82f6, #06b6d4);
            border-radius: 10px;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-bottom: 1.5rem;
            font-size: 1.5rem;
            color: white;
        }

        .option-card h2 {
            font-size: 1.5rem;
            font-weight: 600;
            color: #1e293b;
            margin-bottom: 0.75rem;
        }

        .option-card p {
            color: #64748b;
            margin: 0;
            line-height: 1.6;
        }

        /* Footer */
        .footer {
            background: #1e293b;
            color: white;
            padding: 3rem 2rem 2rem 2rem;
        }

        .footer-content {
            max-width: 1200px;
            margin: 0 auto;
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 2rem;
        }

        .footer-section h3 {
            font-size: 1.25rem;
            font-weight: 600;
            margin-bottom: 1rem;
            color: white;
        }

        .footer-section p, .footer-section li {
            color: #cbd5e1;
            line-height: 1.6;
        }

        .footer-section ul {
            list-style: none;
            padding: 0;
            margin: 0;
        }

        .footer-section ul li {
            margin-bottom: 0.5rem;
        }

        .footer-section a {
            color: #cbd5e1;
            text-decoration: none;
            transition: color 0.2s ease;
        }

        .footer-section a:hover {
            color: #60a5fa;
        }

        .footer-bottom {
            border-top: 1px solid #374151;
            margin-top: 2rem;
            padding-top: 2rem;
            text-align: center;
            color: #94a3b8;
        }

        .social-links {
            display: flex;
            gap: 1rem;
            margin-top: 1rem;
        }

        .social-link {
            width: 40px;
            height: 40px;
            background: #374151;
            border-radius: 8px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: #cbd5e1;
            text-decoration: none;
            transition: all 0.2s ease;
        }

        .social-link:hover {
            background: #3b82f6;
            color: white;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .nav-links {
                display: none;
            }

            .mobile-menu-btn {
                display: block;
            }

            .hero h1 {
                font-size: 2.5rem;
            }

            .hero-subtitle {
                font-size: 1.1rem;
            }

            .hero {
                padding: 3rem 1rem;
            }

            .section-title {
                font-size: 2rem;
            }

            .platform-info, .main-options {
                padding: 3rem 1rem;
            }

            .nav-container {
                padding: 0 1rem;
            }

            .features-grid, .options-grid {
                grid-template-columns: 1fr;
            }

            .stats-grid {
                grid-template-columns: repeat(2, 1fr);
            }
        }

        @media (max-width: 640px) {
            .hero h1 {
                font-size: 2rem;
            }

            .option-card, .feature-card {
                padding: 1.5rem;
            }

            .footer-content {
                grid-template-columns: 1fr;
                gap: 1.5rem;
            }

            .stats-grid {
                grid-template-columns: 1fr;
            }

            .stat-number {
                font-size: 2rem;
            }
        }

        /* Dark mode support */
        @media (prefers-color-scheme: dark) {
            body {
                background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);
                color: #f8fafc;
            }

            .navbar {
                background: #1e293b;
                border-color: #334155;
            }

            .logo {
                color: #f8fafc;
            }

            .nav-links a {
                color: #94a3b8;
            }

            .nav-links a:hover {
                color: #60a5fa;
                background: #374151;
            }

            .platform-info {
                background: #1e293b;
            }

            .section-title {
                color: #f8fafc;
            }

            .section-subtitle, .feature-description, .option-card p {
                color: #94a3b8;
            }

            .feature-card {
                background: #374151;
                border-color: #475569;
            }

            .option-card {
                background: #374151;
                border-color: #475569;
                color: #f8fafc;
            }

            .option-card h2 {
                color: #f8fafc;
            }

            .main-options {
                background: #0f172a;
            }
        }

        /* Reduced motion support */
        @media (prefers-reduced-motion: reduce) {
            * {
                transition: none !important;
                animation: none !important;
            }
        }
    </style>
</head>
<body>
<!-- Navigation Header -->
<nav class="navbar">
    <div class="nav-container">
        <a href="/" class="logo">
            <div class="logo-icon">IP</div>
            Internship Portal
        </a>
        <ul class="nav-links">
            <li><a href="/">Home</a></li>
            <li><a href="view-internships">Browse Internships</a></li>
            <li><a href="add-internship">Post Internship</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
        </ul>
        <button class="mobile-menu-btn">☰</button>
    </div>
</nav>

<!-- Hero Section -->
<section class="hero">
    <div class="hero-content">
        <h1>Welcome to Internship Portal</h1>
        <p class="hero-subtitle">Your gateway to meaningful career experiences. Connect with top companies and launch your professional journey.</p>
        <a href="view-internships" class="cta-button">
            🚀 Explore Opportunities
        </a>
    </div>
</section>

<!-- Platform Info Section -->
<section class="platform-info">
    <div class="section-container">
        <h2 class="section-title">Why Choose Our Platform?</h2>
        <p class="section-subtitle">We're committed to bridging the gap between talented students and innovative companies</p>

        <div class="features-grid">
            <div class="feature-card">
                <div class="feature-icon">🎯</div>
                <h3 class="feature-title">Curated Opportunities</h3>
                <p class="feature-description">Hand-picked internships from top companies across various industries, ensuring quality and relevance for your career goals.</p>
            </div>
            <div class="feature-card">
                <div class="feature-icon">⚡</div>
                <h3 class="feature-title">Easy Application</h3>
                <p class="feature-description">Streamlined application process with user-friendly interface, making it simple to find and apply for internships.</p>
            </div>
            <div class="feature-card">
                <div class="feature-icon">🤝</div>
                <h3 class="feature-title">Direct Connection</h3>
                <p class="feature-description">Connect directly with hiring managers and get real-time updates on your application status.</p>
            </div>
        </div>

        <div class="stats-grid">
            <div class="stat-card">
                <div class="stat-number">500+</div>
                <div class="stat-label">Active Internships</div>
            </div>
            <div class="stat-card">
                <div class="stat-number">50+</div>
                <div class="stat-label">Partner Companies</div>
            </div>
            <div class="stat-card">
                <div class="stat-number">1000+</div>
                <div class="stat-label">Successful Placements</div>
            </div>
            <div class="stat-card">
                <div class="stat-number">95%</div>
                <div class="stat-label">Success Rate</div>
            </div>
        </div>
    </div>
</section>

<!-- Main Options Section -->
<section class="main-options">
    <div class="section-container">
        <h2 class="section-title">Get Started</h2>
        <p class="section-subtitle">Choose your path to success</p>

        <div class="options-grid">
            <a href="view-internships" class="option-card">
                <div class="option-icon">👀</div>
                <h2>View All Internships</h2>
                <p>Browse through our extensive collection of internship opportunities from leading companies across various industries. Find the perfect match for your skills and interests.</p>
            </a>
            <a href="add-internship" class="option-card">
                <div class="option-icon">➕</div>
                <h2>Add Internship</h2>
                <p>Are you a company looking for talented interns? Post your internship opportunities and connect with motivated students ready to contribute to your organization.</p>
            </a>
        </div>
    </div>
</section>

<!-- Footer -->
<footer class="footer">
    <div class="footer-content">
        <div class="footer-section">
            <h3>About Internship Portal</h3>
            <p>We are dedicated to connecting ambitious students with innovative companies, creating meaningful partnerships that drive career growth and business success.</p>
            <div class="social-links">
                <a href="#" class="social-link">📘</a>
                <a href="#" class="social-link">🐦</a>
                <a href="#" class="social-link">💼</a>
                <a href="#" class="social-link">📸</a>
            </div>
        </div>
        <div class="footer-section">
            <h3>Quick Links</h3>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="view-internships">Browse Internships</a></li>
                <li><a href="add-internship">Post Internship</a></li>
                <li><a href="#about">About Us</a></li>
                <li><a href="#careers">Careers</a></li>
            </ul>
        </div>
        <div class="footer-section">
            <h3>Support</h3>
            <ul>
                <li><a href="#help">Help Center</a></li>
                <li><a href="#contact">Contact Us</a></li>
                <li><a href="#faq">FAQ</a></li>
                <li><a href="#privacy">Privacy Policy</a></li>
                <li><a href="#terms">Terms of Service</a></li>
            </ul>
        </div>
        <div class="footer-section" id="contact">
            <h3>Contact Information</h3>
            <p>📧 contact@internshipportal.com</p>
            <p>📞 +1 (555) 123-4567</p>
            <p>📍 123 Innovation Drive<br>Tech Valley, CA 94000</p>
        </div>
    </div>
    <div class="footer-bottom">
        <p>&copy; 2024 Internship Portal. All rights reserved. Built with ❤️ for students and companies worldwide.</p>
    </div>
</footer>
</body>
</html>